const date= new Date();
console.log(date);
console.log(date.getFullYear());
console.log(date.getMonth());
console.log(date.getDay());
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getTime());
console.log(date.getSeconds());
console.log(date.getTimezoneOffset());
let formattedDateTime = date.toLocaleDateString('en-US');
console.log(formattedDateTime);

let bool = true;
let s = String(bool);  
console.log(s);
console.log(typeof(s));
console.log(typeof bool);
console.log(isNaN(null));
console.log(("apple"/7))