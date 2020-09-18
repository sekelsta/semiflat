package sekelsta.semiflat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("semiflat")
public class Semiflat
{
    public Semiflat() {
        // Register ourselves for server and other game events we are interested in
        // Note this registers NON-STATIC methods only
        MinecraftForge.EVENT_BUS.register(this);
    }

    // From the BiomeLoadingEvent documentation, changes that don't 
    // add or remove from a collection should use LOW priority
    @SubscribeEvent(priority = EventPriority.LOW)
    public void setBiomesFlat(BiomeLoadingEvent event) {
        event.setScale(0f);
        event.setDepth(0f);
    }
}
