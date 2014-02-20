/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */



var cellEditing = Ext.create('Ext.grid.plugin.CellEditing', {
    clicksToEdit: 2
});

Ext.define("app.view.MaterialExceptionLogGrid", {
    extend: "Ext.grid.Panel",
    alias: "widget.MaterialExceptionLogGrid",
    title:"异常记录汇总",
    tbar: [{
            xtype: 'button',
            text: '新增',
            handler: add
        }, {
            xtype: 'button',
            text: '提交修改',
            handler: alter
        }, {
            xtype: 'button',
            text: '删除',
            handler: otherDelete
        }, {
            xtype: 'button',
            text: '导出Excel',
            handler: otherDelete
        }],
    height: 400,
    store: Ext.create("app.store.MaterialExceptionLogStore"),
    columnLines: true,
    selModel: Ext.create('Ext.selection.RowModel',{mode:"MULTI"}),
    columns: [{
            header: 'id',
            dataIndex: 'id',
            hidden: true
        },
        {
            header: '物料编码',
            dataIndex: 'materialCode',
            editor: {
                allowBlank: false
            }
        }, {
            header: '供应商代码',
            dataIndex: 'vendorCode',
            editor: {
                allowBlank: false
            }
        }, {
            header: '日期',
            dataIndex: 'logTime',
            editor: {
                allowBlank: false
            }
        }, {
            header: '批次',
            dataIndex: 'batch',
            editor: {
                allowBlank: false
            }
        }, {
            header: '异常内容',
            dataIndex: 'exceptionDesc',
            editor: {
                allowBlank: false
            }
        }, {
            header: '解决对策',
            dataIndex: 'dealDesc',
            editor: {
                allowBlank: false
            }
        }, {
            header: '是否关闭',
            dataIndex: 'status',
            editor: {
                allowBlank: false
            }
        }],
    forceFit: true,
    dockedItems: [{
            xtype: 'pagingtoolbar',
            store: this.store, // same store GridPanel is  using  
            dock: 'bottom',
            displayInfo: true
        }],
    initComponent: function() {
        this.callParent(arguments);//
        this.store.loadPage(1);
    },
     plugins: [cellEditing]
});

function add() {

}
;

function alter() {

}
;

function otherDelete() {

}
;