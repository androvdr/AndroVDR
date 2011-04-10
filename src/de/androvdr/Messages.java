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

package de.androvdr;

import android.os.Message;

public class Messages {
	public static final int MSG_DONE = 0;
	public static final int MSG_PROGRESS_SHOW = 1;
	public static final int MSG_PROGRESS_DISMISS = 2;
	public static final int MSG_PROGRESS_UPDATE = 3;
	public static final int MSG_TITLEBAR_PROGRESS_SHOW = 4;
	public static final int MSG_TITLEBAR_PROGRESS_DISMISS = 5;
	public static final int MSG_VDR_ERROR = 6;
	public static final int MSG_DATA_UPDATE_DONE = 7;
	public static final int MSG_CONTROLLER_READY = 8;
	public static final int MSG_EPGSEARCH_NOT_FOUND = 9;
	
	public static Message obtain(int arg1) {
		Message msg = Message.obtain();
		msg.arg1 = arg1;
		return msg;
	}
	
	public static Message obtain(int arg1, int arg2) {
		Message msg = Messages.obtain(arg1);
		msg.arg2 = arg2;
		return msg;
	}
}
