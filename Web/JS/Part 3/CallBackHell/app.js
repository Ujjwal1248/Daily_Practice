function step1(fn){
    console.log('please wait i am selecting image...');
    setTimeout(function(){
        console.log('image selected');
        fn("selected image");
    }, 4000);
}

function step2(image){
    console.log(`please wait i am applying filter to ${image}...`);
    setTimeout(function(){
        console.log('filter applied');
        fn();
    }, 2000);
}

function step3(){
    console.log('please wait i am uploading image...');
    setTimeout(function(){
        console.log('image uploaded');
    }, 3000);
}

step1(function(image){
    step2(image)
})

