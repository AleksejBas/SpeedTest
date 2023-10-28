console.log('Speed test ran JS!');

let a = 3.1415926, b = 2.718;
console.time('JS');

for(let i = 0; i < 100000000; i++)
    a+=b;

console.timeEnd('JS');
console.log(parseInt(a));