/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vaadin.tinymceeditor.widgetset.shared;

import com.vaadin.shared.ui.textfield.TextFieldState;

/**
 *
 * @author mstahv
 */
public class TinymceState extends TextFieldState {
    
    public String conf;

    /**
     * apply tinymce setup here like
     * function(editor) {
     *     // some stuff
     * }
     */
    public String setupFunction;
    
}
