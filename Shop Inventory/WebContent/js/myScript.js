function showRegForm() {
    $('#customerRegForm').slideDown(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').hide(1000);
}
function checkBalanceForm() {
    $('#checkCustomerBalance').slideDown(300);
    $('#customerRegForm').slideUp(300);
    $('#storeItemsList').hide(1000);
}
function getStoreItemList() {
    $('#customerRegForm').slideUp(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').show(1000);
}
function viewCustomerDetails() {
    $('#customerRegForm').slideUp(300);
    $('#checkCustomerBalance').slideUp(300);
    $('#storeItemsList').hide(1000);
}
