package com.ravolo.ies.core.halfs;

import android.content.Context;

import com.ravolo.ies.core.InternalExternalStorage;
import com.ravolo.ies.storages.AsyncStorage;
import com.ravolo.ies.storages.internal.SqliteStorage;

public class SqliteExternalStorage<E> extends InternalExternalStorage<E> {

	public SqliteExternalStorage(AsyncStorage<E> externalStorage,
			Context context, Class<E> clazz, int dataVersion) {
		super(new SqliteStorage<E>(clazz, dataVersion, context),
				externalStorage);
	}

}
