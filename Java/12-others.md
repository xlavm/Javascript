# Codigos Varios

Contiene fragmentos de codigo utiles

    - Copiar archivo desde SFTP a PC Local en Java
    - Conectar vía SSH con Java y ejecutar comandos
    - Descargar archivo desde ruta FTP
    - Leer datos de una celda de un archivo de Excel
    - Leer un Archivo

## Copiar archivo desde SFTP a PC Local en Java

Descargar las dependencias en GRADLE:

compile group: 'com.jcraft', name: 'jsch', version: '0.1.44-1'

    ```JAVA
    try {
        JSch ssh = new JSch();
        //usuario, host, puerto
        Session session = ssh.getSession("luanvane", "10.72.181.137", 22);
        java.util.Properties config = new java.util.Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.setPassword("MxJ33$!!*g");
        session.connect();
        Channel channel = session.openChannel("sftp");
        channel.connect();
        ChannelSftp sftp = (ChannelSftp) channel;
        //directorio donde esta el archivo a copiar desde FTP
        sftp.cd("/imxuat/intra/imx/interfaces/cxref/imx_cxref_cli/ready");
        //de primero le enviamos el nombre del archivo que está en el FTP y de segundo se manda la ruta en el pc donde se guardará
        sftp.get("CDCXUPEN", "ArchivosInterfaces/");
        Boolean success = true;
        if (success) {
            // El archivo ha sido subido satisfactoriamente
        }
        channel.disconnect();
        session.disconnect();
    } catch (JSchException e) {
        System.out.println(e.getMessage().toString());
        e.printStackTrace();
    } catch (SftpException e) {
        System.out.println(e.getMessage().toString());
        e.printStackTrace();
    }
    ```

---

## Conectar vía SSH con Java y ejecutar comandos

Descargar las dependencias o librerías

    ```BASH
    <dependency>
        <groupId>com.jcraftgroupId>
        <artifactId>jschartifactId>
        <version>0.1.53version>
        <type>jartype>
    dependency>
    ```

Crear la clase conector con el servidor

    ```JAVA
    package co.com.miEmpresa.Modelo;
    /** @author LuisAngel*/
    import com.jcraft.jsch.ChannelExec;
    import com.jcraft.jsch.JSch;
    import com.jcraft.jsch.JSchException;
    import com.jcraft.jsch.Session;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.InputStreamReader;
     
    public class SSHConnector {
        private static final String ENTER_KEY = "n";//tecla ENTER
        private Session session;//sesion ssh
     
        //metodo que establece conexion ssh
        public void connect(String username, String password, String host, int port)
            throws JSchException, IllegalAccessException {
            if (this.session == null || !this.session.isConnected()) {
                JSch jsch = new JSch();
                this.session = jsch.getSession(username, host, port);
                this.session.setPassword(password);
                // Parametro para no validar key de conexion.
                this.session.setConfig("StrictHostKeyChecking", "no");
                this.session.connect();
            } else {
                throw new IllegalAccessException("Sesion SSH ya iniciada.");
            }
        }
        
        //metodo que permite ejecutar un comando ssh 
        public final String executeCommand(String command)
            throws IllegalAccessException, JSchException, IOException {
            if (this.session != null && this.session.isConnected()) {
                // Abrimos un canal SSH. Es como abrir una consola.
                ChannelExec channelExec = (ChannelExec) this.session.
                    openChannel("exec");
                InputStream in = channelExec.getInputStream();
                // Ejecutamos el comando.
                channelExec.setCommand(command);
                channelExec.connect();
                // Obtenemos el texto impreso en la consola.
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                StringBuilder builder = new StringBuilder();
                String linea;
                while ((linea = reader.readLine()) != null) {
                    builder.append(linea);
                    builder.append(ENTER_KEY);
                }
                // Cerramos el canal SSH.
                channelExec.disconnect();
                // Retornamos el texto impreso en la consola.
                return builder.toString();
            } else {
                throw new IllegalAccessException("No existe sesion SSH iniciada.");
            }
        }
     
        //metodo que cierra la sesion ssh
        public final void disconnect() {
            this.session.disconnect();
        }
    }
    ```

Crear la clase de conexión con el servidor y dónde se digitan los comandos

    ```JAVA
    package co.com.miEmpresa.Modelo;
    /** @author LuisAngel*/
    import com.jcraft.jsch.JSchException;
    import java.io.IOException;


    public class SSHConnection {
        
        private static final String USERNAME = "faosorio";
        private static final String HOST = "10.72.165.96";
        private static final int PORT = 22;
        private static final String PASSWORD = "71685106";
     
        public static void main(String[] args) {
            try {
                SSHConnector sshConnector = new SSHConnector();
                //establezco la conexión con el servidor
                sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
                //ejecuto los comandos que quiera aquí:
                sshConnector.executeCommand("sudo su - svcimxdebco");
                sshConnector.executeCommand("cd /imxdevbco/intra/imx/interfaces/lim/comandos");
                sshConnector.executeCommand("sh UTILIZACIONES.ch");
                String result = sshConnector.executeCommand("ls -ltr");
                sshConnector.disconnect();
                //retorno el string del resultado del comando
                System.out.println("resultado es: "+result);
            } catch (JSchException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
    }
    ```

---

## Descargar archivo desde ruta FTP

Creo la clase que se conecta al FTP y copia el archivo desde el FTP al local

    ```JAVA
    package co.com.miEmpresa.Utilidades;


    import com.jcraft.jsch.Channel;
    import com.jcraft.jsch.ChannelSftp;
    import com.jcraft.jsch.JSch;
    import com.jcraft.jsch.JSchException;
    import com.jcraft.jsch.Session;
    import com.jcraft.jsch.SftpException;
    import org.apache.commons.net.ftp.FTPClient;


    /** @author LuisAngel*/


    public class DescargaFTP {


        //metodo que copia el archivo del FTP a una ruta local
        public String copiarArchivoDeFTPALocal(String rutaDirectorioFTP, String RUTA_LOCAL_ARCHIVO, String nombreArchivo) {
            try {
                String resulCopiDeFTPALocal = "";
                JSch ssh = new JSch();
                //usuario, host, puerto
                Session session = ssh.getSession("luanvane", "10.72.181.137", 22);
                java.util.Properties config = new java.util.Properties();
                config.put("StrictHostKeyChecking", "no");
                session.setConfig(config);
                session.setPassword("MxJ33$!!*g");//Contraseña del usuario FTP
                session.connect();
                Channel channel = session.openChannel("sftp");//le desimos que es ftp seguro "sftp"
                channel.connect();
                ChannelSftp sftp = (ChannelSftp) channel;
                //directorio donde esta el archivo a copiar desde FTP
                sftp.cd(rutaDirectorioFTP);
                //de primero le enviamos el nombre del archivo que está en el FTP y de segundo se manda la ruta en el pc donde se guardará
                sftp.get(nombreArchivo, RUTA_LOCAL_ARCHIVO);
                Boolean success = true;
                if (!success) {
                    //dejo un mensaje
                    return resulCopiDeFTPALocal = "No se puedo copiar el archivo desde el FTP.";
                }
                channel.disconnect();
                session.disconnect();
                return resulCopiDeFTPALocal = "Se ha conectado al FTP y descargado el archivo correctamente";
            } catch (JSchException e) {
                System.out.println(e.getMessage());
                return resulCopiDeFTPALocal = "No hay Conexión con el FTP";
            } catch (SftpException e) {
                System.out.println(e.getMessage());
                return resulCopiDeFTPALocal = "No hay archivo generado en la ruta FTP. Es posible que se procese el último archivo generado en la ruta local";
            }
        }


        private static void showServerReply(FTPClient ftpClient) {
            String[] replies = ftpClient.getReplyStrings();
            if (replies != null && replies.length > 0) {
                for (String aReply : replies) {
                    System.out.println("SERVER: " + aReply);
                }
            }
        }
    }
    ```

Código para ejecutar el método de copiar de FTP a Local

    ```JAVA
    //orden de los parametros: ruta_archivo_ftp, ruta_archivo_local, nombre_archivo
    resulCopiDeFTPALocal = descargaFTP.copiarArchivoDeFTPALocal("/ftp/intra/", "/local/carpeta/archivo.txt", "archivo.txt");
    ```

---

## Leer datos de una celda de un archivo de Excel

Leemos un archivo Excel de una ruta y sacamos la hoja, del libro

    ```JAVA
    private FileInputStream archivo;
    private Workbook libroExcel;
    private Sheet hoja;


    public void leerArchivoDeExcel() throws IOException {
        archivo = new FileInputStream("resources/main/archivo.xlsx");
        libroExcel = new XSSFWorkbook(archivo);
        hoja = libroExcel.getSheetAt(0);
    }
    ```

Metodo que lee la celda

    ```JAVA
    public String Celda(String celda) {
        FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
        CellReference cellReference = new CellReference(celda);
        Row row = sheet.getRow(cellReference.getRow());
        Cell cell = row.getCell(cellReference.getCol());
        CellValue cellValue = evaluator.evaluate(cell);
        switch (cellValue.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC://si la celda es un numero
                return String.valueOf((int) cellValue.getNumberValue());
            case Cell.CELL_TYPE_STRING://si la celda es una cadena de caracteres
                return cellValue.getStringValue();
        }
        return "";
    }
    ```

Invocar el método que lee el dato de la celda

    ```JAVA
    String celdaC3 = Celda("C3");
    ```

---

## Leer un Archivo

Lee el archivo, lo recorre, lo agrega en una lista y lo muestra por pantalla en un textbox

    ```JAVA
    //#LEER UN ARCHIVO
    BufferedReader archivo = new BufferedReader(new FileReader(/ruta/local/archivo.txt));
    ArrayList<String> lista = new ArrayList<String>();//lista donde se agregará linea a linea del archivo
    String Linea;
    String mostrarArchivo = "";
    while ((Linea = archivo.readLine()) != null) {
        lista.add(Linea);//se agrega la linea leida del archivo
        mostrarArchivo = mostrarArchivo + Linea + "\n";
    }
    txtTextArea.setText(mostrarArchivo);
    archivo.close();
    ```

---
