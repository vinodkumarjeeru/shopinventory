function showRegForm() {
    $('#customerRegForm').slideDown(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').hide(1000);
    $('#updateAddress').hide("slide", {direction: "down"}, 1000);
}
function checkBalanceForm() {
    $('#checkCustomerBalance').slideDown(300);
    $('#customerRegForm').slideUp(300);
    $('#storeItemsList').hide(1000);
    $('#updateAddress').hide("slide", {direction: "down"}, 1000);
}
function getStoreItemList() {
    $('#customerRegForm').slideUp(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').show(1000);
    $('#updateAddress').hide("slide", {direction: "down"}, 1000);
}
function viewCustomerDetails() {
    $('#customerRegForm').slideUp(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').hide(1000);
    $('#updateAddress').hide("slide", {direction: "down"}, 1000);
}
function updateAddress() {
    $('#customerRegForm').hide("slide", {direction: 'right'}, 300);
    $('#checkCustomerBalance').hide("slide", {direction: 'right'}, 300);
    $('#storeItemsList').hide("slide", {direction: 'right'}, 300);
    $('#updateAddress').show("slide", {direction: "left"}, 1000);
}
function showModal() {
    $('.ui.basic.modal').modal('setting', 'closable', false).modal('show');
}
function sendData(requestType, urlPattern, data) {
    var res;
    $.ajax({
        type: requestType,
        url: urlPattern,
        data: data,
        success: function(responseText) {
            res = responseText;
            if (res !== null) {
                window.location = 'index.jsp';
                return;
            }
            alert("Please enter valid details");
            return;

        }
    });

}
function showItemsEntry() {
    var mainDiv = $('<div class="five fields"></div>');
    var sub1 = $('<div class="field"></div>');
    var sub2 = $('<div class="field"></div>');
    var sub3 = $('<div class="field"></div>');
    var sub4 = $('<div class="field"></div>');
    var sub5 = $('<div class="field"></div>');
    var sub6 = $('<div class="field"></div>');
    $('<input/>').attr({type: 'text', id: 'serialNo', name: 'serialNo', placeholder: 'Serial No'}).appendTo(sub1);
    $('<input/>').attr({type: 'text', id: 'itemId', name: 'itemId', placeholder: 'Item Id'}).appendTo(sub2);
    $('<input/>').attr({type: 'text', id: 'itemName', name: 'itemName', placeholder: 'Item Name'}).appendTo(sub3);
    $('<input/>').attr({type: 'text', id: 'noItems', name: 'noItems', placeholder: 'No.Of Items'}).appendTo(sub4);
    $('<input/>').attr({type: 'text', id: 'price', class: 'billing', name: 'price', placeholder: 'Price'}).appendTo(sub5);
    $(mainDiv).append(sub1);
    $(mainDiv).append(sub2);
    $(mainDiv).append(sub3);
    $(mainDiv).append(sub4);
    $(mainDiv).append(sub5);
    $(mainDiv).insertAfter($(".five.fields").eq($(".five.fields").length-1));
}
