import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nu")
public class class351 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   static final class351 field4282 = new class351();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   static final class351 field4280 = new class351();
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lnu;"
   )
   static final class351 field4281 = new class351();
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = -934359099
   )
   @Export("cameraY")
   static int cameraY;

   class351() {
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "-28082582"
   )
   static int method6636(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            HealthBar.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + class393.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               long var14 = 86400000L * (11745L + (long)var11);
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  HealthBar.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class211.method4151(class188.compareStrings(Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1], class69.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = TextureProvider.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var12 = TextureProvider.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     HealthBar.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MusicPatchPcmStream.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskAction.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class28.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var17 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        var7 = var3.charAt(var6);
                        if (var7 == 60) {
                           var17 = true;
                        } else if (var7 == 62) {
                           var17 = false;
                        } else if (!var17) {
                           var16.append((char)var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     HealthBar.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     HealthBar.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 2];
                     if (BuddyRankComparator.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (BuddyRankComparator.localPlayer.appearance.field3461) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               HealthBar.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
               if (BuddyRankComparator.localPlayer.appearance != null && BuddyRankComparator.localPlayer.appearance.gender != 0) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V",
      garbageValue = "55"
   )
   @Export("insertMenuItem")
   static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!Client.isMenuOpen) {
         if (Client.menuOptionsCount < 500) {
            Client.menuActions[Client.menuOptionsCount] = var0;
            Client.menuTargets[Client.menuOptionsCount] = var1;
            Client.menuOpcodes[Client.menuOptionsCount] = var2;
            Client.menuIdentifiers[Client.menuOptionsCount] = var3;
            Client.menuArguments1[Client.menuOptionsCount] = var4;
            Client.menuArguments2[Client.menuOptionsCount] = var5;
            Client.menuItemIds[Client.menuOptionsCount] = var6;
            Client.menuShiftClick[Client.menuOptionsCount] = var7;
            ++Client.menuOptionsCount;
         }

      }
   }
}
