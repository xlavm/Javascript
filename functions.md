# Functions

return an JSON and one value
```JS
function obtainValue(){
  const value ={ value: 'hola'}
  return value
}

var newValue = obtainValue()
console.log(newValue.value) 
// output: hola
console.log(newValue)
/* output: 
{ valor:"hola" } 
*/
```
-----

with params 
```JS
function sum(value1, value2){
  return value1 + value2
}
console.log(sum(3,4))
// output: 7
```
-----

