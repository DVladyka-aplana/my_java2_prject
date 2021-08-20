/**
 * Created for java 2.0 , Ex: 4.2
 * @author Vladyka
 */
package Ex_4;
public class Sweet {
    int weight;
    int price;
    String name;
    String info;
    /**
     *
     * @param name
     * @param price
     * @param weight
     * @param info
     */
    public Sweet(String name, int price, int weight, String info) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.info = info;
    }
    /**
     *
     * @return String Name
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @param name add String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @return return String Info
     */
    public String getInfo() {
        return info;
    }
    /**
     *
     * @param info set String Info
     */
    public void setInfo(String info) {
        this.info = info;
    }
    /**
     *
     * @return int price
     */
    public int getPrice() {
        return price;
    }
    /**
     *
     * @param price set Int
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     *
     * @return int weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     *
     * @param weight set int
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
