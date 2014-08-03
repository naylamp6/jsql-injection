/*******************************************************************************
 * Copyhacked (H) 2012-2014.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.model.bean;

/**
 * Define a Column, e.g is sent to the view by the model after injection.
 * Allow to traverse upward to its corresponding table
 */
public class Column extends ElementDatabase {
    // The table that contains the current column
    private Table parentTable;

    // Define the column label and parent table
    public Column(String newColumnName, Table newTableName) {
        this.elementValue = newColumnName;
        this.parentTable = newTableName;
    }

    // Return the parent table
    @Override
    public ElementDatabase getParent() {
        return parentTable;
    }

    // Default 0, a column doesn't contain anything
    @Override
    public int getCount() {
        return 0;
    }

    // A readable label for column is its own label, nothing fancy
    @Override
    public String getLabel() {
        return toString();
    }
}
