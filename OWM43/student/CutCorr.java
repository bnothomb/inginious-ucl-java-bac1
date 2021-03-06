/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

public class CutStu {

	/**
	  * @param str: String représentant la chaine de caractère. Ne peut pas être null
	  * @param c: Caractère qui sert de délimiteur.
	  *
	  * @return -
	  */
	public static void cut(String str, char c){
		String [] t = str.split(c);
		for(String s : t)
			System.out.println(s);
	}	
}
