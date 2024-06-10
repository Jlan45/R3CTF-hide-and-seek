# R3CTF-hide-and-seek
hide-and-seek plugin source code and solution
```java
	public void onInitialize() {
		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
			dispatcher.register(ClientCommandManager.literal("findben").executes(context -> {
                new Thread(() -> {
					MinecraftClient client = MinecraftClient.getInstance();
					ClientPlayerEntity player = client.player;
					if (client.world != null) {
						for (int i = 0; i < 4; i++) {
							for (int j = 0; j < 4; j++) {
								int x=64+i*128;
								int z=64+j*128;
								int y=0;
								player.sendCommand("newtp "+x+" "+y+" "+z);
								Boolean hasBen = false;
								for (Entity entity : client.world.getEntities()) {
									if(entity.getType().toString().equals("entity.minecraft.villager")) {
										client.player.sendMessage(Text.literal("Entity name: " + entity.getDisplayName().getSiblings().get(0).getString().toString()));
										hasBen=true;
										break;
									}
								}
								if(!hasBen) {
									client.player.sendMessage(Text.literal("这里没有Ben"));
								}
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									throw new RuntimeException(e);
								}
							}
						}

					}
					else {
						System.out.println("World is null, cannot get entities.");
					}
					return;
				}).start();
                return 0;
            }));
		});
		LOGGER.info("Hello Fabric world!");
	}
```
