/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.lab3;


/**
 *
 * @author Назар
 */
    enum stortype {
    StProdov,
    StHosyast
    }


public class storage {
    int stnum;
    public stortype sttype;
    tovar[] tovars;
    int tovkol;

    public storage() {
    }

    public void printtype() {
        if (this.sttype == stortype.StProdov) {
          System.out.println("Продовольственный");
        }
        else {
            this.sttype = stortype.StHosyast;
            System.out.println("Хозяйственный");
        }
    }

    public void tovinfo() {
        int it;

        System.out.println("\nТип склада: ");
        this.printtype();
        System.out.printf("\nКоличество видов товаров на %d складе: %d", this.stnum, this.tovkol);
        for (it = 0; it < this.tovkol; it++) {
            System.out.printf("\nНомер товара: %d", this.tovars[it].tovnum);
            System.out.printf("\nНаименование товара: %s", this.tovars[it].tovname);
            System.out.printf("\nКоличество в наличии: %d\n", this.tovars[it].tkol);
        }
        
    }
}
