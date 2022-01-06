'use strict';
$(function() {
  // お気に利入りショップに追加ボタンクリックでお気に入り追加
  $(document).on('click', '#likes_shop_btn', function () {
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
});