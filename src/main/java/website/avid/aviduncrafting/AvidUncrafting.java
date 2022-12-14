package website.avid.aviduncrafting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.simple.SimpleChannel;

@Mod(AvidUncrafting.ID)
public class AvidUncrafting {
    public static final String ID = "avid_uncrafting";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public static SimpleChannel CHANNEL;

    public AvidUncrafting() {
        var modEvent = FMLJavaModLoadingContext.get().getModEventBus();
        modEvent.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
    }
}
