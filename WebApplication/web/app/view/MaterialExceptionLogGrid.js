
var cellEditing = Ext.create('Ext.grid.plugin.CellEditing', {
    clicksToEdit: 2
});

Ext.define("app.view.MaterialExceptionLogGrid", {
    extend: "Ext.grid.Panel",
    alias: "widget.MaterialExceptionLogGrid",
//    title:"异常记录汇总",
    tbar: [{
            xtype: 'button',
            text: '新增',
            iconCls: 'icon-add',
            id:'MaterialExceptionLog_AddBtn'
        }, {
            xtype: 'button',
            text: '删除',
            iconCls: 'icon-delete',
            id:'MaterialExceptionLog_DeleteBtn'
        }, {
            xtype: 'button',
            text: '保存',
            iconCls: 'icon-save',
            id:'MaterialExceptionLog_SaveBtn'
        }, {
            xtype: 'button',
            text: '导出',
            iconCls: 'icon-excel',
            id:'MaterialExceptionLog_ExportBtn'
        },
        '-',
//        '->',
        {
            xtype: 'textfield',
            name: 'materialCode',
            emptyText: '物料号',
            allowBlank:false,
            id:'MaterialExceptionLog_materialCode'
        },
//        {
//            xtype: 'textfield',
//            name: 'vendorCode',
//            emptyText: '供应商',
//            id:'MaterialExceptionLog_vendorCode'
//        },
        {
            xtype: 'button',
            id: 'MaterialExceptionLog_SearchBtn',
            itemId:'MaterialExceptionLog_SearchBtn',
            text: '查找'
        }

    ],
    height: 500,
    store: 'MaterialExceptionLogStore',
    columnLines: true,
    selModel: Ext.create('Ext.selection.RowModel', {mode: "MULTI"}),
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
            header: '供应商',
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
            store: 'MaterialExceptionLogStore', // same store GridPanel is  using  
            dock: 'bottom',
            displayInfo: true
        }],
    initComponent: function() {
        this.callParent(arguments);//
//        this.store.loadPage(1);
    },
    plugins: [cellEditing]

});
