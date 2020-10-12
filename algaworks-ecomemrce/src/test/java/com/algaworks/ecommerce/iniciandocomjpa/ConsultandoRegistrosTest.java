package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ConsultandoRegistrosTest extends EntityManagerTest {

    @Test
    public  void atualizarAReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone Samsom");

        entityManager.refresh(produto);

        Assert.assertEquals("Kindle", produto.getNome());
    }


}