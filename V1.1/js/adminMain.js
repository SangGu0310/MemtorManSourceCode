$(function(){
    var body = $('body'); // 바디
    var menu_toggle = $('#menu_toggle'); // 상단 삼지창 bar
    var sidebar_menu = $('#sidebar-menu'); // 왼쪽 메뉴 토글전체
    var sidebar_footer = $('.sidebar-footer'); // 왼쪽 메뉴 아래 숨기기 기능
    var left_col = $('.left_col'); // 왼쪽 메뉴 전체
    var right_col = $('.right_col'); // 중앙 info
    var nav_menu = $('.nav_menu'); // 상단 메뉴
    var footer = $('footer'); // 맨 아래

    var setContentHeight = function(){
        // reset height
        $(".right_col").css('min-height',$(window).height());
    };
    $("#sidebar-menu").find('a').on('click',function(){
        $(this).$('ul').css('display',block);
    });
});
