package entity;

import npc.Merchant;

public interface Seller {
    String sell(Merchant.Goods goods);
}
