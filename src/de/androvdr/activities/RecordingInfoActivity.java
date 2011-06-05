/*
 * Copyright (c) 2010-2011 by androvdr <androvdr@googlemail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 * For more information on the GPL, please go to:
 * http://www.gnu.org/copyleft/gpl.html
 */

package de.androvdr.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import de.androvdr.Preferences;
import de.androvdr.R;
import de.androvdr.controllers.RecordingInfoController;

public class RecordingInfoActivity extends AbstractGestureActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recordinginfo);

		LinearLayout view = (LinearLayout) findViewById(R.id.reci);
		
		/*
		 * setTheme doesn't change background color :(
		 */
		if (Preferences.blackOnWhite)
			view.setBackgroundColor(Color.WHITE);
		
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			int recordingNumber = bundle.getInt("recordingnumber");
			new RecordingInfoController(this, handler, view, recordingNumber);
		}
	}
}
