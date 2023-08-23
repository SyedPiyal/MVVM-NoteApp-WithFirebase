package com.piyal.noteappfirebase.data.repository

import com.piyal.noteappfirebase.data.model.Task
import com.piyal.noteappfirebase.data.model.User
import com.piyal.noteappfirebase.util.UiState

interface TaskRepository {
    fun addTask(task: Task, result: (UiState<Pair<Task,String>>) -> Unit)
    fun updateTask(task: Task, result: (UiState<Pair<Task,String>>) -> Unit)
    fun deleteTask(task: Task, result: (UiState<Pair<Task,String>>) -> Unit)
    fun getTasks(user: User?, result: (UiState<List<Task>>) -> Unit)
}