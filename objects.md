# Objects

```JS
var obj = new Object()

obj.nombre = 'Luis Vanegas'
obj['edad'] = 16
console.log(obj.nombre)
console.log(obj['nombre'])
console.log(obj.edad)
console.log(obj['edad'])
// output: Luis Vanegas
// output: Luis Vanegas
// output: 16
// output: 16
```

-----

methods

```JS
var obj = new Object()
obj.sumar = function(x, y){
    return x + y
}
var resultSuma = obj.sumar(1, 10)
console.log(resultSuma)
// output: 11
```