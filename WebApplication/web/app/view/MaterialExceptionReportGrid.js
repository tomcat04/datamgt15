
Ext.define('app.view.MaterialExceptionReportGrid', {
    extend: 'Ext.grid.Panel',
    layout: {
        type: 'fit',
        align: 'stretch'
    },
    store: 'MaterialExceptionLogStore',
    columnLines: true,
    height: 400,
    selModel: Ext.create('Ext.selection.RowModel', {mode: "MULTI"}),
    columns: [
        {
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
            header: '物料描述',
            dataIndex: 'materialDesc',
            width:350,
            editor: {
                allowBlank: false
            }
        }, {
            header: '原厂描述',
            dataIndex: 'materialDesc2',
            editor: {
                allowBlank: false
            }
        }, {
            header: '适用项目',
            dataIndex: 'QMS',
            editor: {
                allowBlank: false
            }
        }, {
            header: '供应商',
            dataIndex: 'vendorName',
            editor: {
                allowBlank: false
            }
        }, {
            header: '品牌',
            dataIndex: 'brand',
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
//    forceFit: true,
    dockedItems: [{
            xtype: 'pagingtoolbar',
            store : 'MaterialExceptionLogStore',
            dock: 'bottom',
            displayInfo: true
        }],
    tbar:[
        {xtype:'button',text:'添加',iconCls: 'icon-add'},
        {xtype:'button',text:'删除',iconCls: 'icon-delete'},
        {xtype:'button',text:'修改',iconCls: 'icon-save'},
        {xtype:'button',text:'导出',iconCls: 'icon-excel'}
    ],
    initComponent: function() {
        this.callParent(arguments);//

    }
//    renderTo: 'userMngDiv',
//             autoRender:true  
});


