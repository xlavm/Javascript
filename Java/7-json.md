# JSON

## Prerrequisito

Debe tener instalada la libreria `org.json` e importarla en la clase asi: `import org.json.*;`

1. JSON Object

    ```JAVA
    JSONObject obj = new JSONObject();
    obj.put("name", "foo");
    obj.put("num", 100);
    obj.put("balance", 1000.21);
    obj.put("is_vip", true);
    System.out.print(obj);
    /* salida:
    {
    "name": " foo ",
    "num": 100,
    "balance": 1000.21,
    "Italia": true
    } 
    */
    ```

2. JSON Array

    ```JAVA
    JSONArray arr = new JSONArray();
    arr.add("foo");
    arr.add(new Integer(100));
    arr.add(new Double(1000.21));
    arr.add(new Boolean(true));
    arr.add(new JSONObject());
    System.out.print(arr);
    /* salida:
    [" foo ", 100, 1000.21, true]
    */
    ```

3. Sub JSON

    ```JAVA
    JSONObject obj = new JSONObject();
    obj.put("name", "foo");
    obj.put("num", new Integer(100));
    obj.put("balance", new Double(1000.21));
    obj.put("is_vip", new Boolean(true));
    obj.put("detail", new JSONObject());
    System.out.print(obj);
    /* salida:
    {
    "name": " foo ",
    "num": 100,
    "balance": 1000.21,
    "is_vip": true,
    "Detail": { }
    }
    */
    ```

4. Convertir JSON a String

    ```JAVA
    JSONObject obj = new JSONObject();
    arr.add("foo");
    arr.add(new Integer(100));
    arr.add(new Double(1000.21));
    arr.add(new Boolean(true));
    obj.toJSONString()
    System.out.print(obj);
    /* salida:
    {
    "name": " foo ",
    "num": 100,
    "balance": 1000.21,
    "Italia": true
    } 
    */
    ```
