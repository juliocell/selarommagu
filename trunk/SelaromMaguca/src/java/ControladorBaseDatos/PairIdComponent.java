/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class PairIdComponent {
    private String Key1Property = "Key1";
    private String Key2Property = "Key2";
    private Object _Key1;
    private Object _Key2;

    public PairIdComponent(Object key1, Object key2)
        {
            _Key1 = key1;
            _Key2 = key2;
        }

    /**
     * @return the Key1Property
     */
    public String getKey1Property() {
        return Key1Property;
    }

    /**
     * @param Key1Property the Key1Property to set
     */
    public void setKey1Property(String Key1Property) {
        this.Key1Property = Key1Property;
    }

    /**
     * @return the Key2Property
     */
    public String getKey2Property() {
        return Key2Property;
    }

    /**
     * @param Key2Property the Key2Property to set
     */
    public void setKey2Property(String Key2Property) {
        this.Key2Property = Key2Property;
    }

    /**
     * @return the _Key1
     */
    public Object getKey1() {
        return _Key1;
    }

    /**
     * @param Key1 the _Key1 to set
     */
    public void setKey1(Object Key1) {
        this._Key1 = Key1;
    }

    /**
     * @return the _Key2
     */
    public Object getKey2() {
        return _Key2;
    }

    /**
     * @param Key2 the _Key2 to set
     */
    public void setKey2(Object Key2) {
        this._Key2 = Key2;
    }

//    public override int GetHashCode()
//        {
//            return _Key1.GetHashCode() ^ _Key2.GetHashCode();
//        }
//
//        public override bool Equals(object obj)
//        {
//            if (this == obj) return true;
//            PairIdComponent pairIdComponent = obj as PairIdComponent;
//            if (pairIdComponent == null) return false;
//            if (!Equals(_Key1, pairIdComponent._Key1)) return false;
//            if (!Equals(_Key2, pairIdComponent._Key2)) return false;
//            return true;
//        }
//
//        public override string ToString()
//        {
//            return _Key2.ToString();
//        }
}
