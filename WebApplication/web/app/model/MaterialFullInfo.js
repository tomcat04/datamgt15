/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define('MaterialFullInfo', {
    extend: 'Ext.data.Model',
    fields: [{
            name: 'id',
            type: 'int',
            useNull: true//这样数字如果值为空则不会自动转成0,则提交时注意后台bean类中的属性int要用对象类型，否则解析出错  
        }, {
            name: 'recordId',
            type: 'string'
        }, {
            name: 'materialCode',
            type: 'string'
        }, {
            name: 'materialDesc',
            type: 'string'
        },
        {
            name: 'materialDesc2',
            type: 'string'
        },
//        {
//            name: 'image', //TODO :IMAGE
//            type: 'string'
//        } , 
        {
            name: 'QMS',
            type: 'string'
        }, {
            name: 'vendorCode',
            type: 'string'
        }, {
            name: 'vendorName',
            type: 'string'
        }, {
            name: 'brand',
            type: 'string'
        }, {
            name: 'vendorGrade',
            type: 'string'
        }, {
            name: 'phone',
            type: 'string'
        }, {
            name: 'mobilePhone',
            type: 'string'
        }, {
            name: 'email',
            type: 'string'
        }, {
            name: 'deliveryCycle',
            type: 'string'
        }, {
            name: 'deliveryStatus',
            type: 'string'
        }],
    idProperty: 'id'// 关系到表格修改数据的获取  
});  