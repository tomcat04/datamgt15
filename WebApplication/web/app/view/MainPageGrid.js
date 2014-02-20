/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

Ext.require("app.model.MaterialFullInfo");
var store = new Ext.data.Store({
    model: 'app.model.MaterialFullInfo',
    pageSize: 20,
    proxy: {
        type: 'ajax',
        url: '/data/MaterialFullInfoData.json',
        reader: {
            type: 'json',
            root: 'pageBean.list',
            totalProperty: 'pageBean.total'
        }
    },
    autoLoad: false
});

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
//    title: 'All Products',
    height: 400,
    store: store,
    columnLines: true,
    selModel: Ext.create('Ext.selection.CheckboxModel'),
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
            store: store, // same store GridPanel is  using  
            dock: 'bottom',
            displayInfo: true
        }],
    initComponent: function() {
        this.callParent(arguments);//
        store.loadPage(1);
    },
//    renderTo: 'userMngDiv',
    plugins: [cellEditing]
//             autoRender:true  
});