
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
            name: 'materialDesc',
            type: 'string'
        }, {
            name: 'materialDesc2',
            type: 'string'
        }, 
        {
            name: 'itemFor',
            type: 'string'
        }, 
        {
            name: 'vendorName',
            type: 'string'
        }, {
            name: 'brand',
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