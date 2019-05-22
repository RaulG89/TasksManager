package com.example.tasksmanager.platform.component;

import android.app.Application;

import androidx.fragment.app.Fragment;

import com.example.tasksmanager.TaskManagerApp;
import com.example.tasksmanager.platform.module.ActivityBindingModule;
import com.example.tasksmanager.platform.module.TaskManagerModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                ActivityBindingModule.class,
                TaskManagerModule.class,
                AndroidSupportInjectionModule.class
        }
)
public interface TaskManagerComponent extends AndroidInjector<TaskManagerApp> {

        @Component.Builder
        interface Builder {
                @BindsInstance
                Builder application(TaskManagerApp application);
                TaskManagerComponent build();
        }

        void inject(TaskManagerApp taskManagerApp);
}
