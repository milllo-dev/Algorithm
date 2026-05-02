import Foundation

func solution(_ queue1: [Int], _ queue2: [Int]) -> Int {
    var que1: Queue<Int> = Queue()
    var que2: Queue<Int> = Queue()
    
    let n = queue1.count
    var q1sum = 0
    var q2sum = 0
    
    
    for value in queue1 {
        que1.enqueue(value)
        q1sum += value
    }
    
    for value in queue2 {
        que2.enqueue(value)
        q2sum += value
    }
    
    for i in 0..<n*3 {
        if q1sum == q2sum {
            return i
        }
        else if q1sum > q2sum {
            guard let value = que1.dequeue() else {return -1}
            que2.enqueue(value)
            
            q1sum -= value
            q2sum += value
        }
        else {
            guard let value = que2.dequeue() else {return -1}
            que1.enqueue(value)
            
            q1sum += value
            q2sum -= value
        }
    }
    
    return -1;
}

struct Queue<T> {
    private var inbox : [T] = []
    private var outbox : [T] = []
    
    var isEmpty : Bool {
        return inbox.isEmpty && outbox.isEmpty
    }
    
    mutating func enqueue(_ element: T) {
        inbox.append(element)
    }
    
    mutating func dequeue() -> T? {
        if(outbox.isEmpty) {
            outbox = inbox.reversed()
            inbox.removeAll()
        }
        
        return outbox.popLast()
    }
}