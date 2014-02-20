/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


Ext.define("app.model.MaterialExceptionLogModel",{
    extend:"Ext.data.Model",
     fields: [{
            name: 'id',
            type: 'int',
            useNull: true
        }, {
            name: 'materialCode',
            type: 'string'
        }, {
            name: 'vendorCode',
            type: 'string'
        }, {
            name: 'logTime',
            type: 'string'
        },
        {
            name: 'batch',
            type: 'string'
        },
        {
            name: 'exceptionDesc',
            type: 'string'
        }, {
            name: 'dealDesc',
            type: 'string'
        }, {
            name: 'status',
            type: 'string'
        }],
    idProperty: 'id'// 关系到表格修改数据的获取  
});