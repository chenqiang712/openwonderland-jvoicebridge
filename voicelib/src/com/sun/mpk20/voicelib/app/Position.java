/*
 * Copyright 2007 Sun Microsystems, Inc.
 *
 * This file is part of jVoiceBridge.
 *
 * jVoiceBridge is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License version 2 as 
 * published by the Free Software Foundation and distributed hereunder 
 * to you.
 *
 * jVoiceBridge is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Sun designates this particular file as subject to the "Classpath"
 * exception as provided by Sun in the License file that accompanied this 
 * code. 
 */
package com.sun.mpk20.voicelib.app;

import java.io.Serializable;

public class Position implements Serializable {

    public double x;
    public double y;
    public double z;
    public double orientation;
    
    public Position(double x, double y, double z, double orientation) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.orientation = orientation;
    }

    public String toString() {
        return "(" + Util.round100(x) + ", " + Util.round100(y) + ", " 
    	    + Util.round100(z) + ")" + ":" + Util.toDegrees(orientation);
    }

}