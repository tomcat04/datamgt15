var cellEditing = Ext.create('Ext.grid.plugin.CellEditing', {
    clicksToEdit: 2
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
Ext.define('app.view.MainPageGrid', {
    extend: "Ext.grid.Panel",
    tbar: [{
            xtype: 'button',
            text: '新增',
            iconCls: 'icon-add',
            handler: add
        }, {
            xtype: 'button',
            text: '删除',
            iconCls: 'icon-delete',
            handler: alter
        }, {
            xtype: 'button',
            text: '保存',
            iconCls: 'icon-save',
            handler: otherDelete
        }, {
            xtype: 'button',
            text: '导出',
            iconCls: 'icon-excel',
            handler: otherDelete
        }],
//    title: 'All Products',
    height: 400,
    store: 'MaterialFullInfoStore',
    columnLines: true,
    selModel: Ext.create('Ext.selection.RowModel',{mode:"MULTI"}),
    columns: [{
            header: 'id',
            dataIndex: 'id',
            hidden: true
        }, {
            header: '编号',
            dataIndex: 'recordId',
            editor: {
                allowBlank: false
            }
        }, {
            header: '物料编码',
            dataIndex: 'materialCode',
            editor: {
                allowBlank: false
            }
        }, {
            header: '物料描述',
            dataIndex: 'materialDesc',
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
            header: '质量管理体系',
            dataIndex: 'QMS',
            editor: {
                allowBlank: false
            }
        }, {
            header: '供应商代码',
            dataIndex: 'vendorCode',
            editor: {
                allowBlank: false
            },
            hidden: true
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
            header: '供应商等级',
            dataIndex: 'vendorGrade',
            editor: {
                allowBlank: false
            }
        }, {
            header: '座机',
            dataIndex: 'phone',
            editor: {
                allowBlank: false
            }
        }, {
            header: '手机',
            dataIndex: 'mobilePhone',
            editor: {
                allowBlank: false
            }
        }, {
            header: 'E-mail',
            dataIndex: 'email',
            editor: {
                allowBlank: false
            }
        }, {
            header: '交货周期',
            dataIndex: 'deliveryCycle',
            editor: {
                allowBlank: false
            }
        }, {
            header: '供货状态',
            dataIndex: 'deliveryStatus',
            editor: {
                allowBlank: false
            }
        }],
    forceFit: true,
    dockedItems: [{
            xtype: 'pagingtoolbar',
            store: 'MaterialFullInfoStore', // same store GridPanel is  using  
            dock: 'bottom',
            displayInfo: true
        }],
    initComponent: function() {
        this.callParent(arguments);
    },
    plugins: [cellEditing]
});