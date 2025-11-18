let book={

    title:"harry potter",
    author:"J.K.rowlling",
    price:1000,

    displayInfo:function(params){

        console.log(`${this.title} is written by ${this.author}`);
    }
}

book.displayInfo();
console.log(typeof book);
console.log(book.title); 