package dev.tweep.hohenheim.data;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class PlayerData implements Serializable {

    private final UUID playerId;
    private int maxEntropy = 50;
    private int entropy = 0;
    private int regenerationRate = 5;

}
