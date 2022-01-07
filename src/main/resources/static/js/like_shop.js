'use strict';
$(function() {
  //お気に入りに追加
  $(document).on('click', '#likes_shop_btn', function () {
  	$('#likes_shop_btn').hide();
  	$('#delete_likes_shop_btn').show();
    $.ajax({
        url: 'http://localhost:8080/like/shop',
        dataType: 'text',
        data: { 
          userId: $("#userId").val(),
          shopId: $("#shopId").val()
        },
		type: 'post',
        async: true
    }).done(function() {
    	alert('お気に入りに追加しました');
    }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
      // 失敗時には、その旨をダイアログ表示
      alert('正しい結果を得られませんでした。');
      console.log('XMLHttpRequest : ' + XMLHttpRequest.status);
      console.log('textStatus     : ' + textStatus);
      console.log('errorThrown    : ' + errorThrown.message);
    });
  });
  
  	//お気に入りから削除
    $(document).on('click', '#delete_likes_shop_btn', function () {
  	$('#delete_likes_shop_btn').hide();
  	$('#likes_shop_btn').show();
    $.ajax({
        url: 'http://localhost:8080/like/deleteLikeShop',
        dataType: 'text',
        data: { 
          userId: $("#userId").val(),
          shopId: $("#shopId").val()
        },
		type: 'post',
        async: true
    }).done(function() {
    	alert('お気に入りから削除しました');
    }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
      // 失敗時には、その旨をダイアログ表示
      alert('正しい結果を得られませんでした。');
      console.log('XMLHttpRequest : ' + XMLHttpRequest.status);
      console.log('textStatus     : ' + textStatus);
      console.log('errorThrown    : ' + errorThrown.message);
    });
  });
  
});