

function TodoItem({ todo, onComplete, onDelete }) {
    return (
        <div className="card">
            <div className="card-body">
                <div className="d-flex justify-content-around">
                    <input type="checkbox"
                        checked={todo.completed}
                        onChange={e => onComplete(todo.id)} />
                    <div className="ml-auto">{todo.title}</div>
                    <button className="btn btn-danger" onClick={e => onDelete(todo.id)}>Delete</button>
                </div>
            </div>
        </div>
    )
}

export default TodoItem;