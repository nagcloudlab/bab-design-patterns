import TodoItem from "./TodoItem";


function TodoList({ todos, onComplete, onDelete }) {
    return (
        <div className="card mt-2">
            <div className="card-body">
                <div className="list-group">
                    {todos.map(todo => (
                        <TodoItem key={todo.id}
                            todo={todo}
                            onComplete={onComplete}
                            onDelete={onDelete}
                        />
                    ))}
                </div>
            </div>
        </div>
    )
}

export default TodoList;