/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class InfantrySupportPortableFlamerWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -5741978934100309295L;

    public InfantrySupportPortableFlamerWeapon() {
        super();

        name = "Flamer (Man-Portable)";
        setInternalName(name);
        addLookupName("InfantryPortableFlamer");
        addLookupName("Portable Flamer");
        addLookupName("Flamer (man-portable)");
        addLookupName("Flamer (Man-Pack)");
        cost = 100;
        bv = 0.50;
        flags = flags.or(F_DIRECT_FIRE).or(F_FLAMER).or(F_ENERGY).or(F_INF_SUPPORT).or(F_INF_ENCUMBER);
        String[] modeStrings = { "Damage", "Heat" };
        setModes(modeStrings);
        infantryDamage = 0.55;
        infantryRange = 0;
        crew = 1;
        introDate = 1950;
        techLevel.put(1950,TechConstants.T_ALLOWED_ALL);
        availRating = new int[]{RATING_A,RATING_A,RATING_A,RATING_A};
        techRating = RATING_C;
        rulesRefs =" 273, TM";
    }
}
