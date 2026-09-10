const arr=[1,2,3,4,5];

//map
const squares=arr.map(n=>n*n);
console.log(squares);

//filter
const even=arr.filter(n=>n%2==0);
console.log(even);

//reduce
const sum=arr.reduce((prev,curr)=>prev+curr,0);
console.log(sum);