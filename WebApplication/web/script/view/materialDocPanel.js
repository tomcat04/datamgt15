/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


var panel = Ext.create('Ext.panel.Panel', {  
    title : 'panel标题',
    draggable : false, 
    items : [{
                    xtype : 'datefield',  
                    fieldLabel : '开始日期'  
                    }]
});