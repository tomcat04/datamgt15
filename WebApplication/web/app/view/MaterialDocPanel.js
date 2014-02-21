Ext.define("app.view.MaterialDocPanel",{
    extend:"Ext.panel.Panel",
    title : 'panel标题',
    draggable : false, 
    items : [{
                    xtype : 'datefield',  
                    fieldLabel : '开始日期'  
                    }]
});