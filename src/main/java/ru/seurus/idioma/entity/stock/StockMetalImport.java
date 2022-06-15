package ru.seurus.idioma.entity.stock;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "STOCK_METAL_IMPORT")
public class StockMetalImport implements MethodsStock{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RECIPE_ID")
    private Integer recipeId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "PURCHASE_DATE")
    private LocalDate date;

    @Column(name = "PROD_COEFFICIENCY")
    private Double coef;

    @Column(name = "QUANTITY_CAT_BOUGHT")
    private Double quantityCatBought;

    @Column(name = "QUANTITY_BOUGHT")
    private Double quantityBought;

    @Column(name = "QUANTITY_CAT_CURRENT")
    private Double quantityCatCurrent;

    @Column(name = "QUANTITY_CURRENT")
    private Double quantityCurrent;

    @Column(name = "PRICE_PU_CAT")
    private Double pricePUCat;

    @Column(name = "PRICE_PU")
    private Double pricePU;

    @Column(name = "PRICE_EURO")
    private Double priceEuro;

    @Column(name = "PRICE_RESULT")
    private Double priceResult;
}
