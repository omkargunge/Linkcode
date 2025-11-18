let arr=[1,2,3,4,5];



let sum=arr.reduce((current,next)=>{
    console.log(current,next);

    return current+next

});
console.log(sum);