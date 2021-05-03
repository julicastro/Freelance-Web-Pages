AOS.init();
document.addEventListener('DOMContentLoaded', function() {

    scrollNav();
    hideNavBar();
});

function scrollNav() {
    const enlaces = document.querySelectorAll('.navegacion-principal .scroll');

    enlaces.forEach( function( enlace ) {
        enlace.addEventListener('click', function(e) {
            e.preventDefault();
            const seccion = document.querySelector(e.target.attributes.href.value);

            seccion.scrollIntoView({
                behavior: 'smooth'
            });
        });
    });
}

$(document).ready(function(){ 
    $(".nav-mas").click(function(){
      if($('.hide-nav-bar').is(":visible")){
          $('.hide-nav-bar').slideUp();
      }else{
        $('.hide-nav-bar').slideDown();
      }
    });

});