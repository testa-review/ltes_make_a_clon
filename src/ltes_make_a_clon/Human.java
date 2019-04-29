/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltes_make_a_clon;

/**
 *
 * @author sergio
 */
class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public Human clone() throws CloneNotSupportedException{

        return new Human(this.name);
    }
}
