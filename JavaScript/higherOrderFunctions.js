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

//forEach
arr.forEach(n=>console.log(n));

//find
const fEven = arr.find((num) => num % 2 == 0);
console.log(fEven);


arr[0]=-1;
//some
const hasNeg = arr.some((num) => num < 0);
console.log(hasNeg);

arr[0]=1;
//every
const allPos = arr.every((num) => num > 0);
console.log(allPos)