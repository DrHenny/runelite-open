import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("az")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ac")
	@Export("details")
	HashMap details;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	WorldMapArea field5164;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 726023317
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1037523117
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2111299207
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 339182027
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ar")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bt")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 412214793
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1217478649
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -633270133
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1496461701
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2061982451
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1472614383
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bg")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bs")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -988749081
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1660914053
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -433758033
	)
	int field5183;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -440386403
	)
	int field5204;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 360088355
	)
	int field5207;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 701079749
	)
	int field5186;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		longValue = -6945096001606229017L
	)
	long field5158;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 357929951
	)
	int field5188;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1135341129
	)
	int field5189;
	@ObfuscatedName("bn")
	boolean field5165;
	@ObfuscatedName("bd")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bz")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bk")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("br")
	HashSet field5194;
	@ObfuscatedName("bf")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1950756805
	)
	int field5156;
	@ObfuscatedName("cl")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cm")
	List field5198;
	@ObfuscatedName("cg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cu")
	HashSet field5205;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ce")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1973390925
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1054887437
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1900110705
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1027213083
	)
	int field5190;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = -1;
		this.worldMapTargetY = -1;
		this.worldMapDisplayWidth = -1;
		this.worldMapDisplayHeight = -1;
		this.worldMapDisplayX = -1;
		this.worldMapDisplayY = -1;
		this.maxFlashCount = 3;
		this.cyclesPerFlash = 50;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = -1;
		this.flashCycle = -1;
		this.field5183 = -1;
		this.field5204 = -1;
		this.field5207 = -1;
		this.field5186 = -1;
		this.field5165 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5194 = new HashSet();
		this.elementsDisabled = false;
		this.field5156 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5205 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5190 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;Lqh;Ljava/util/HashMap;[Lvv;I)V",
		garbageValue = "25208224"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2740.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method4649(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5164 = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2023309818"
	)
	public void method9001() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "1742502103"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method4850(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); Projectile.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5205.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5205.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						Projectile.runScriptEvent(var14);
					}
				}

				this.field5205 = var11;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-820997134"
	)
	public void method9003(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = WorldMapData_1.method4861();
			this.method9199(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field5207 = var1;
						this.field5186 = var2;
						this.field5183 = this.centerTileX;
						this.field5204 = this.centerTileY;
					}

					if (this.field5183 != -1) {
						int var8 = var1 - this.field5207;
						int var9 = var2 - this.field5186;
						this.setWorldMapPosition(this.field5183 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5204, false);
					}
					break label41;
				}
			}

			this.method9008();
		}

		if (var4) {
			this.field5158 = var5;
			this.field5188 = var1;
			this.field5189 = var2;
		}

	}

	@ObfuscatedName("ap")
	void method9199(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = Client.indexCheck;
				if (BuddyRankComparator.method3038() && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					NPC.method2713(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var10 = true;
					if (this.field5165) {
						int var11 = var1 - this.field5188;
						int var12 = var2 - this.field5189;
						if (var4 - this.field5158 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3339, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeIntIME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field5158 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1602520512"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class485.field5030 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-989672663"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX - this.centerTileX;
			int var2 = this.worldMapTargetY - this.centerTileY;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "158446480"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		WorldMapData_1.method4861();
		if (var3) {
			this.method9008();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090657076"
	)
	final void method9008() {
		this.field5186 = -1;
		this.field5207 = -1;
		this.field5204 = -1;
		this.field5183 = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2125982961"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljm;",
		garbageValue = "802672685"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-10679878"
	)
	public void method9011(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5164 || var4) {
			this.field5164 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2006513716"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1961719461"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "-471501961"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)V",
		garbageValue = "1"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-157720836"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Lnl;Lnl;ZI)V",
		garbageValue = "-1761963154"
	)
	public void method9017(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMap(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1947983663"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field5198 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("aa")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var8);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		int var9 = this.cacheLoader.getPercentLoaded();
		if (var9 < 100) {
			this.drawLoading(var1, var2, var3, var4, var9);
		} else {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method4811(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var11 = this.worldMapRenderer.method4819();
			double var12 = (double)(var11 >> 16 & 255) / 256.0D;
			double var14 = (double)(var11 >> 8 & 255) / 256.0D;
			double var16 = (double)(var11 & 255) / 256.0D;
			var12 = Math.pow(var12, var6);
			var14 = Math.pow(var14, var6);
			var16 = Math.pow(var16, var6);
			int var18 = (int)(var12 * 256.0D);
			int var19 = (int)(var14 * 256.0D);
			int var20 = (int)(var16 * 256.0D);
			int var10 = var20 + (var19 << 8) + (var18 << 16) + -16777216;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
			if (this.flashingElements != null) {
				++this.flashCycle;
				if (this.flashCycle % this.cyclesPerFlash == 0) {
					this.flashCycle = 0;
					++this.flashCount;
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var13 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var22 = (int)Math.ceil((double)((float)var4 / this.zoom));
			this.worldMapRenderer.drawTiles(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			if (!this.elementsDisabled) {
				boolean var15 = false;
				if (var5 - this.field5156 > 100) {
					this.field5156 = var5;
					var15 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5194, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var15);
			}

			this.method9013(var1, var2, var3, var4, var13, var22);
			if (BuddyRankComparator.method3038() && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var13;
			this.worldMapDisplayHeight = var22;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2053924176"
	)
	public void method9066() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "67"
	)
	boolean method9083(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5190 != Client.field799) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1586308991"
	)
	void method9013(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class485.field5030 != null) {
			int var7 = 512 / (this.worldMapRenderer.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
			int var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method9083(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class485.field5030.method7388(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5190 = Client.field799;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method10019(var13, var14, 192);
			} else {
				this.sprite.method10021(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-880473091"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method4811(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1783409593"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "276046287"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-86"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "711194994"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1744584606"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-983074910"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1948790576"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "274550039"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-959147283"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1886433491"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1046281474"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "-1713768897"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1301306069"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1793509256"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2146996983"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "434939029"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1196389082"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-17"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (class165.WorldMapElement_get(var2) != null && class165.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(class165.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1073593463"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "67"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "227181200"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method9128();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "59"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (class165.WorldMapElement_get(var3) != null && class165.WorldMapElement_get(var3).category == var1) {
				int var4 = class165.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method9128();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-850052283"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1410298200"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-621020219"
	)
	void method9128() {
		this.field5194.clear();
		this.field5194.addAll(this.enabledElements);
		this.field5194.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "91"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method4850(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = class165.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							UrlRequester.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnl;B)Lnl;",
		garbageValue = "82"
	)
	public Coord method9056(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapRenderer.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var10 * var10 + var9 * var9;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IILnl;Lnl;B)V",
		garbageValue = "21"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		Projectile.runScriptEvent(var5);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Lkh;",
		garbageValue = "504963130"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5198 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5198.addAll(var3);
			}

			this.iconIterator = this.field5198.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Lkh;",
		garbageValue = "-2125905855"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}
}
