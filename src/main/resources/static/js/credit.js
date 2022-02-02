'use strict';
$(function() {
  $('input[name="paymentMethodId"]').change( function() {
    if($("#cash").prop('checked')){
      $('#creditInfo').hide();
	} else if ($('#card').prop('checked')) {
      $('#creditInfo').show();
    } 
  });
});