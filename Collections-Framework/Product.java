public class Product<T,V> {
    T item;
    V price;

    public void setProduct(T item,V price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public V getPrice(){
        return this.price;
    }
}
