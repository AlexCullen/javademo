package demoday11;

/**
 * @Author: cpzh
 * @Date: 2018/3/30 11:25
 * TODO: 设计一个对象
 * 类的简单设计原则: 遇到的名词设计成类， 名词的状态设计成域， 操作该名词的动作设计成方法
 * 举例： 图书可以设计成类
 *        书名、作者、价格可以设计成该类的域
 *        购买、运输可以设计成该类的方法
 */
public class DiyBook {
    private String name;
    private String author;
    private String wordCount;
    private Double price;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getWordCount(){
        return this.wordCount;
    }

    public void setWordCount(String wordCount){
        this.wordCount = wordCount;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public DiyBook(){

    }

    public DiyBook(String name, String author, String wordCount, double price){
        this.name = name;
        this.author = author;
        this.price = price;
        this.wordCount = wordCount;
    }
}
